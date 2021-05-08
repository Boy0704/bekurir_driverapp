package com.bekurir.driverapp.utils.api.service;

import com.bekurir.driverapp.json.AcceptRequestJson;
import com.bekurir.driverapp.json.AcceptResponseJson;
import com.bekurir.driverapp.json.BankResponseJson;
import com.bekurir.driverapp.json.ChangePassRequestJson;
import com.bekurir.driverapp.json.GetOnRequestJson;
import com.bekurir.driverapp.json.JobResponseJson;
import com.bekurir.driverapp.json.StripeRequestJson;
import com.bekurir.driverapp.json.UpdateLocationRequestJson;
import com.bekurir.driverapp.json.AllTransResponseJson;
import com.bekurir.driverapp.json.DetailRequestJson;
import com.bekurir.driverapp.json.DetailTransResponseJson;
import com.bekurir.driverapp.json.EditVehicleRequestJson;
import com.bekurir.driverapp.json.EditprofileRequestJson;
import com.bekurir.driverapp.json.GetHomeRequestJson;
import com.bekurir.driverapp.json.GetHomeResponseJson;
import com.bekurir.driverapp.json.LoginRequestJson;
import com.bekurir.driverapp.json.LoginResponseJson;
import com.bekurir.driverapp.json.PrivacyRequestJson;
import com.bekurir.driverapp.json.PrivacyResponseJson;
import com.bekurir.driverapp.json.RegisterRequestJson;
import com.bekurir.driverapp.json.RegisterResponseJson;
import com.bekurir.driverapp.json.ResponseJson;
import com.bekurir.driverapp.json.TopupRequestJson;
import com.bekurir.driverapp.json.TopupResponseJson;
import com.bekurir.driverapp.json.VerifyRequestJson;
import com.bekurir.driverapp.json.WalletRequestJson;
import com.bekurir.driverapp.json.WalletResponseJson;
import com.bekurir.driverapp.json.WithdrawRequestJson;
import com.bekurir.driverapp.json.WithdrawResponseJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface DriverService {

    @POST("driver/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("driver/update_location")
    Call<ResponseJson> updatelocation(@Body UpdateLocationRequestJson param);

    @POST("driver/syncronizing_account")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("driver/logout")
    Call<GetHomeResponseJson> logout(@Body GetHomeRequestJson param);

    @POST("driver/turning_on")
    Call<ResponseJson> turnon(@Body GetOnRequestJson param);

    @POST("driver/accept")
    Call<AcceptResponseJson> accept(@Body AcceptRequestJson param);

    @POST("driver/start")
    Call<AcceptResponseJson> startrequest(@Body AcceptRequestJson param);

    @POST("driver/finish")
    Call<AcceptResponseJson> finishrequest(@Body AcceptRequestJson param);

    @POST("driver/edit_profile")
    Call<LoginResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("driver/edit_kendaraan")
    Call<LoginResponseJson> editKendaraan(@Body EditVehicleRequestJson param);

    @POST("driver/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("driver/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("driver/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("driver/register_driver")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @POST("customerapi/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("driver/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);

    @POST("driver/job")
    Call<JobResponseJson> job();


    @POST("customerapi/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("customerapi/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("driver/withdraw")
    Call<WithdrawResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("customerapi/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("driver/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("driver/verifycode")
    Call<ResponseJson> verifycode(@Body VerifyRequestJson param);

    @POST("driver/stripeaction")
    Call<ResponseJson> actionstripe(@Body StripeRequestJson param);

    @POST("driver/intentstripe")
    Call<ResponseJson> intentstripe(@Body StripeRequestJson param);


}
