package com.feedbackserver.Service;


import com.feedbackserver.Repository.Repo;
import com.feedbackserver.providerGrpc.ProviderfeedbackGrpc;
import com.feedbackserver.providerGrpc.ProviderfeedbackOuterClass;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.feedbackserver.Repository.Repo.RepoConnection;

public class ProviderFeedbackService extends ProviderfeedbackGrpc.ProviderfeedbackImplBase {
    @Override
    public void getAllFeedback(ProviderfeedbackOuterClass.empty request, StreamObserver<ProviderfeedbackOuterClass.feedMessage1> responseObserver) {
        try {

            ResultSet getAll = Repo.getAllFeedback();

            ProviderfeedbackOuterClass.feedMessage1.Builder Response = ProviderfeedbackOuterClass.feedMessage1.newBuilder();

            while (getAll.next() == true) {

                Integer feedbackid = getAll.getInt("feedbackid");
                String name = getAll.getString("name");
                Integer customerId = getAll.getInt("customerId");
                Integer bookingid = getAll.getInt("bookingid");
                Integer rating = getAll.getInt("rating");
                String writeReview = getAll.getString("writeReview");

                ProviderfeedbackOuterClass.feedMessage1.Builder getallfeed = Response.setFeedbackid(feedbackid).setName(name).setCustomerId(customerId).setBookingid(bookingid).setRating(rating).setWriteReview(writeReview);

                responseObserver.onNext(getallfeed.build());
//                    responseObserver.onCompleted();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getFeedbackById(ProviderfeedbackOuterClass.FeedbackID request, StreamObserver<ProviderfeedbackOuterClass.feedMessage> responseObserver) {
        try {
            Integer n1 = request.getBookingid();
            ResultSet result = Repo.get(n1);
            boolean next = result.next();

            Connection connection = RepoConnection();
            ProviderfeedbackOuterClass.feedMessage.Builder Response = ProviderfeedbackOuterClass.feedMessage.newBuilder();

            if (next == false) {
                ProviderfeedbackOuterClass.feedMessage.Builder all = Response.setMessageApi("Booking ID is not present");
                responseObserver.onNext(all.build());
                responseObserver.onCompleted();
                System.out.println("Booking ID is not present");
            } else {
                if (next == true) {

                    while (next) {
                        Integer s2 = result.getInt("feedbackid");
                        String s3 = result.getString("name");
                        Integer s4 = result.getInt("customerId");
                        Integer s5 = result.getInt("bookingid");
                        Integer s6 = result.getInt("rating");
                        String s7 = result.getString("writeReview");

                        ProviderfeedbackOuterClass.feedMessage.Builder all = Response.setFeedbackid(s2).setName(s3).setCustomerId(s4).setBookingid(s5).setRating(s6).setWriteReview(s7);
                        responseObserver.onNext(all.build());
                        responseObserver.onCompleted();
                        break;
                    }
                } else {
                    responseObserver.onCompleted();
                }
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

       @Override
        public void updateFeedbackById(ProviderfeedbackOuterClass.updateFeedback request, StreamObserver<ProviderfeedbackOuterClass.APIResponse> responseObserver) {
           Integer booking = request.getBookingid();
           Integer rating = request.getRating();
           boolean res = false;
           String writeReview = request.getWriteReview();
           Connection connection = RepoConnection();

           try {

               ProviderfeedbackOuterClass.APIResponse.Builder builder = ProviderfeedbackOuterClass.APIResponse.newBuilder();
               ResultSet result = Repo.get(booking);
               boolean next = result.next();
               if (rating <= 5 && rating >= 1 && booking !=0  && next == true && writeReview != null) {

                    res = Repo.update(booking, rating, writeReview);

                    if (res == true) {
                       builder.setResponseMessage("review is updated").setResponseCode(200);
                   }
               }

               if (res == false ) {
                   builder.setResponseMessage("review is not updated").setResponseCode(995);
               }
                    if ( rating >= 6 || rating <= 0) {
                        builder.setResponseMessage("u can give only 1 to 5").setResponseCode(00);
                    }
                    if (writeReview == null) {
                        builder.setResponseMessage("please give the feedback").setResponseCode(00);
                    }
                    responseObserver.onNext(builder.build());
                    responseObserver.onCompleted();
                } catch(SQLException e){
                    throw new RuntimeException(e);
                }
            }
    @Override
    public void deleteFeedbackById(ProviderfeedbackOuterClass.FeedbackID request, StreamObserver<ProviderfeedbackOuterClass.APIResponse> responseObserver) {

        Integer booking = request.getBookingid();
        Connection connection = RepoConnection();

        try {
            boolean res = Repo.Delete(booking);
            ProviderfeedbackOuterClass.APIResponse.Builder builder = ProviderfeedbackOuterClass.APIResponse.newBuilder();

            if(res==true){
                builder.setResponseMessage("review is Deleted").setResponseCode(200);

            }else if(res==false){

                builder.setResponseMessage("booking id is not present").setResponseCode(00);
            }

            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    }

