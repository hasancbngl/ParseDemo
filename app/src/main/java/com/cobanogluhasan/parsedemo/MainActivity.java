package com.cobanogluhasan.parsedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.LogOutCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sign up
       /* ParseUser parseUser = new ParseUser();
        parseUser.setUsername("hasan");
        parseUser.setPassword("hasanSPASS");

        parseUser.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e==null) {
                    Log.i(TAG, "done: " + "sign up worked");
                }
                else {
                    e.printStackTrace();
                }
            }
        });

       //log in
        ParseUser.logInInBackground("hasan", "hasanSPASS", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e==null && user!=null) {
                    Log.i(TAG, "done: login Succesfull: " + user.getUsername());
                }
                else e.printStackTrace();
            }
        });


        //log out 1
        ParseUser.logOut();

       //log out 2
       ParseUser.logOutInBackground(new LogOutCallback() {
           @Override
           public void done(ParseException e) {
               if (e==null) Log.i(TAG, "done: " + "logged out");
               else e.printStackTrace();
           }
       }); */

       if (ParseUser.getCurrentUser()!=null) {
           Log.i(TAG, "onCreate: "+ "signed in: user=>" + ParseUser.getCurrentUser().getUsername());
       }
       else {
           Log.i(TAG, "onCreate: "+ "you're not signed in ");
       }




        ParseAnalytics.trackAppOpenedInBackground(getIntent());


/*
       ParseQuery<ParseObject> query = ParseQuery.getQuery("Car");
        query.whereEqualTo("driver", "hasan"); //search particular column
        query.setLimit(1); // limited only to 1 result
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e==null) {
                    if(objects.size()>0) {
                        for (ParseObject object: objects){
                            Log.i(TAG, "done: driver:" + object.getString("driver"));
                            Log.i(TAG, "done: year:" + object.getInt("year"));
                            Log.i(TAG, "done: model:" + object.getString("model"));
                        }
                    }
                }
                else e.printStackTrace();
            }
        });


;   ParseQuery<ParseObject> query = ParseQuery.getQuery("Car");
   query.whereGreaterThan("year",2015);

   query.findInBackground(new FindCallback<ParseObject>() {
       @Override
       public void done(List<ParseObject> objects, ParseException e) {
           if(e==null) {
               if(objects.size()>0) {
                   for (ParseObject object:objects) {
                           object.put("year", object.getInt("year")-41);
                           object.saveInBackground();
                   }
               }
           }
       }
   });


        ParseObject car = new ParseObject("Car");
        car.put("driver", "emrah");
        car.put("model", "ford");
        car.put("year", 2020);

        car.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null) {
                    Log.i(TAG, "done: " + "successfully car object added" );
                }
                else { Log.i(TAG, "done: it failed." );
                e.printStackTrace();
                }
            }
        });

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Car");
        query.getInBackground("lTUTIYlDCc", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e==null && object!=null) {

                    object.put("year", 2015); // update year
                    object.saveInBackground();

                    Log.i(TAG, "done: driver:" + object.getString("driver"));
                    Log.i(TAG, "done: year:" + object.getInt("year"));
                }

                else Log.i(TAG, "done: " + "it failed");

            }
        });

      ParseObject tweet = new ParseObject("Tweet");
      tweet.put("usarname", "hasan");
      tweet.put("tweet", "That's the challange btch");
      tweet.saveInBackground(new SaveCallback() {
          @Override
          public void done(ParseException e) {
              if(e==null) {
                  Log.i(TAG, "done: " +"successfully created" );
              }
              else {
                  e.printStackTrace();
              }
          }
      });

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");
        query.getInBackground("sv8rPVfREz", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(object!=null && e==null) {
                    object.put("tweet", "The challange successfully done man!!");
                    object.put("usarname", "rickmickcick");
                    object.saveInBackground();

                    Log.i(TAG, "done: " + object.getString("tweet"));
                    Log.i(TAG, "done: " + object.getString("usarname"));
                }
            }
        });*/

    }
}