# all_ads_work
#.........Simple Facebook Ads Steps.........
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

