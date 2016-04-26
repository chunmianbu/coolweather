package com.coolweather.app.util;
/*
 * ÒÑÐÞ¸Ä
 */

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
