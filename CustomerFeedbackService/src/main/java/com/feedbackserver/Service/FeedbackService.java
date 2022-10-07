package com.feedbackserver.Service;

import com.feedbackserver.grpc.Feedback;
import com.feedbackserver.grpc.feedbackGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;

import static com.feedbackserver.Repository.Repo.*;

public class FeedbackService extends feedbackGrpc.feedbackImplBase{

    @Override
    public void addFeedback(Feedback.feedMessage request, StreamObserver<Feedback.APIResponse> responseObserver) {

        Integer feedbackid = request.getFeedbackid();
        String name = request.getName();
        Integer customerId = request.getCustomerId();
        Integer bookingid = request.getBookingid();
        Integer rating = request.getRating();
        String writeReview = request.getWriteReview();

        Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
        try {
            if(getCustomer(customerId).next()==true) {

                if (feedbackid == null || name == null || customerId == null || bookingid == null || rating == null || writeReview == null) {

                    response.setResponseMessage("review is not added").setResponseCode(99);

                } else {

                    Connection connection = RepoConnection();
                    if (rating <= 5 && rating >= 0 && bookingid != 0 && customerId != 0 && name != null && customerId != 0 && feedbackid != 0) {

                        add(feedbackid, name, customerId, bookingid, rating, writeReview);

                        response.setResponseMessage("review is added").setResponseCode(100);
                    } else {
                        response.setResponseMessage("review is not added").setResponseCode(99);
                    }
                }
            }else {
                response.setResponseMessage("customerId not present").setResponseCode(98);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }


            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

