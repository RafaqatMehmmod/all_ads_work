# all_ads_work
# .........Simple Facebook Ads Steps.........
# Step 1 (Add Dependencies)
* https://developers.facebook.com/docs/audience-network/setting-up/platform-setup/android/add-sdk

# Step 2 ( Initialize SDK Only One Time Using Helper Class)
* https://developers.facebook.com/docs/audience-network/setting-up/platform-setup/android/initialize-sdk

# Rules Of Banner And Rectangle Ads
https://developers.facebook.com/docs/audience-network/guides/ad-formats/banner
* A banner is a small bar ad that appears at the bottom or top of your content. Banner ads usually measure 320 x 50, Medium Rectangle ads usually measure 300 x 250.
Avoid placing banner / medium rectangle ads over text, image, and other clickable portions of your app to prevent accidental clicks.
Only include one ad per page or show one ad at a time if scrolling.
Avoid placing banner / medium rectangle ads in an area that interrupts the natural flow of the app to prevent accidental clicks.
Do not edit or modify banner / medium rectangle ads in any way without Facebook’s written approval.

# Interstitial Ads (Working of IA)
* An interstitial is a full screen ad that appears at a natural transition point in your app.
* Interstitial ads must not be implemented in such a way that may surprise users or interrupt the natural flow of the app. They should be placed in between natural breaks in the experience of your app. For example, interstitial ads should be shown between levels or stages for gaming apps and are not permitted on placements such as app load, exit pages or in the middle of game play.
The call-to-action must be shown in a way that when a user clicks on the ad it is intentional.
Do not edit or modify interstitial ads in any way without Facebook’s written approval.

# Error (Interstitial ad failed to load: No fill)
* Solution
* 1. Enter device in logcat show the device hash id
* 2. Copy this line and add in onCreate Method (AdSettings.addTestDevice("Use ur own hash id");)
* Plus Point If you are using the default Google Android emulator, you'll add the following line of code before loading a test ad:
AdSettings.addTestDevice("HASHED ID");.

# Native Ad (Working)
* https://developers.facebook.com/docs/audience-network/guides/ad-formats/native
* https://developers.facebook.com/docs/audience-network/setting-up/ad-setup
* ![image](https://user-images.githubusercontent.com/107309494/186504643-89fd3e95-a3a5-49f8-be56-1f7d8ecbcb87.png)
* Step 1: Requesting a Native Ad
* Step 2: Creating your Native Ad Layout
* Step 3: Populating your Layout Using the Ad's Metadata
* Step 4: Using MediaView
* Setp 5: Load Ad without Auto Cache
# Native Banner Ad (Working)
* The native banner ad API allows you to build a customized experience for showing a native ad without the advertiser's creative assets, such as image, video, or carousel content.
* In this guide we will implement the following native banner ad placement. You will create a native banner ad with the following components:

* View #1: AdOptionsView
* View #2: Sponsored Label
* View #3: Ad Icon
* View #4: Ad Title
* View #5: Social Context
* View #6: Call-to-Action button
![image](https://user-images.githubusercontent.com/107309494/187078224-b68a4375-b50f-4556-be85-15dffd3524c8.png)

# Native Banner Ad Steps
* Step 1: Requesting a Native Banner Ad
* Step 2: Creating your Native Banner Ad Layout
* Step 3: Populating your Layout Using the Ad's Metadata

# Rewarded Video Faceboook Ads ( Working ) 
* Rewarded video ads are a full screen experience where users opt-in to view a video ad in exchange for something of value, such as virtual currency, in-app items, exclusive content, and more. The ad experience is 15-30 second non-skippable and contains an end card with a call to action. Upon completion of the full video, you will receive a callback to grant the suggested reward to the user.
# Step-by-Step
* Step 1: Initializing Rewarded Video Ads in your Activity
* Step 2: Showing Rewarded Video Ads in your Activity
# .........Simple ADMOB Ads Steps.........
# Step 1 (Add Dependencies)
* https://developers.google.com/admob/android/quick-start#java

# Step 2 (Add Manifest Metadata)
*   <!-- Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713 -->
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy"/>

# Step 3 ( Initialize SDK Only One Time Using Helper Class)
*  MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

