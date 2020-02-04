# AndyHandy

[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0) [![Latest AndyHandy Release](https://jitpack.io/v/onecode369/andyHandy.svg)](https://jitpack.io/#onecode369/andyHandy)

## How to add BasicAnkoLibrary to your app
---
### To get this library into your app:

Step 1. Add the JitPack repository to your build file
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
Step 2. Add the dependency
```
dependencies {
  implementation 'com.github.onecode369:andyHandy:$andyHandy_version'
}
```

## AndyHandy consist of :
- **AndyHandy Commons**
  - **Toast**
  - **Snackbar**
  - **Alert Dialog Box**
  - **Notification**
  - **Intents**
  

- **AndyHandy Animations**
  - **Slide Animations**
    - **Slide In**
      - **from Top**
      - **from Bottom**
      - **from Left**
      - **from Right**
    - **Slide Out**
      - **from Top**
      - **from Bottom**
      - **from Left**
      - **from Right**
---

## AndyHandy Commons

### Toast
- Short Length Toast 
  - Inside Activity
    ```
    toast("Hi there!") // CharSequence
    toast(R.string.app_name) //Int
    ```
  - Outside Activity
    ```
    toastOther(context,"Hi there!") // CharSequence
    toastOther(context,R.string.app_name) //Int
    ```
- Long Length Toast 
  - Inside Activity
    ```
    longToast("Hi there!") // CharSequence
    longToast(R.string.app_name) //Int
    ```
  - Outside Activity
    ```
    longToastOther(context,"Hi there!") // CharSequence
    longToastOther(context,R.string.app_name) //Int
    ```
  
### Snackbar
- Short Length Snackbar 
    ```
    snackbar(view,"Hi there!") // CharSequence
    snackbar(view,R.string.app_name) //Int
    
    /* Snackbar with action */
    // CharSequence
    
    snackbar(view,"Hi there!",
          "Action Button Name",{
              action_here
          })
   
   //Int
   snackbar(view,R.string.app_name,
          "Action Button Name",{
              action_here
          })
    ```
- Long Length Snackbar 
    ```
    longSnackbar(view,"Hi there!") // CharSequence
    longSnackbar(view,R.string.app_name) //Int
    
    /* Snackbar with action */
    // CharSequence
    
    longSnackbar(view,"Hi there!",
          "Action Button Name",{
              action_here
          })
   
   //Int
   longSnackbar(view,R.string.app_name,
          "Action Button Name",{
              action_here
          })
    ```
- Indefinite Length Snackbar 
    ```
    indefiniteSnackbar(view,"Hi there!") // CharSequence
    indefiniteSnackbar(view,R.string.app_name) //Int
    
    /* Snackbar with action */
    // CharSequence
    
    indefiniteSnackbar(view,"Hi there!",
          "Action Button Name",{
              action_here
          })
   
   //Int
   indefiniteSnackbar(view,R.string.app_name,
          "Action Button Name",{
              action_here
          })
    ```
     
### Alert Dialog
- Dialog Box with positive button only
  - Inside Activity
      ```
      //CharSequence
      dialogBox("title", "message",
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                })
      //Int
      dialogBox(R.string.title, R.string.message,
                  cancelable(Boolean) ,positiveButtonText, {
                      positiveButtonFun()
                  })
      ```
  - Outside Activity
      ```
      //CharSequence
      dialogBoxOther( context , "title", "message",
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                })
      //Int
      dialogBoxOther( context ,R.string.title, R.string.message,
                  cancelable(Boolean) ,positiveButtonText, {
                      positiveButtonFun()
                  })
      ```
  
- Dialog Box with positive button as well as negative 
  - Inside Activity     
      ```
      //CharSequence
      dialogBox("title", "message",
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                },
                negativeButtonText,{
                    negativeButtonFun()
                })
      //Int
      dialogBox(R.string.title, R.string.message,
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                },
                negativeButtonText,{
                    negativeButtonFun()
                })
      ```
  - Outside Activity     
      ```
      //CharSequence
      dialogBoxOther( context , "title", "message",
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                },
                negativeButtonText,{
                    negativeButtonFun()
                })
      //Int
      dialogBoxOther( context , R.string.title, R.string.message,
                cancelable(Boolean) ,positiveButtonText, {
                    positiveButtonFun()
                },
                negativeButtonText,{
                    negativeButtonFun()
                })
      ```      
     
### Notification
- Inside Activity
  ```
  notification(uniqueId , channelId , contentTitle , contentText , 
  description , smallIcon , largeIcon)
  ```
- Outside Activity
  ```
  notificationOther(context , uniqueId , channelId , contentTitle , 
  contentText , description , smallIcon , largeIcon)
  ```     
     

### Intents
- Explicit Intent
  - Inside Activity
    - Without putExtras
      ```
      // Without creating new flag 
      ankoStartActivity( Activity Class Object )
      // With new flag
      ankoStartActivity( Activity Class Object , true )
      ```
    - With putExtras
      ```
      // Without creating new flag 
      ankoStartActivity( Activity Class Object , false ,
                variable number of arguments of Pair )
      // With new flag
      ankoStartActivity( Activity Class Object , true ,
                variable number of arguments of Pair )
      ```
  - Outside Activity
    - Without putExtras
      ```
      // Without creating new flag 
      ankoStartActivityOther( context , Activity Class Object )
      // With new flag
      ankoStartActivityOther( context , Activity Class Object , true )
      ```
    - With putExtras
      ```
      // Without creating new flag 
      ankoStartActivityOther( context , Activity Class Object , false ,
                variable number of arguments of Pair )
      // With new flag
      ankoStartActivityOther( context , Activity Class Object , true ,
                variable number of arguments of Pair )
      ```

- Implicit Intents
  - Browse Intent
    - Inside Activity
      ```
      browse( full url as String )
      ```
    - Outside Activity
      ```
      browseOther(contex , full url as String )
      ```
      
  - Share Intent
    - Inside Activity
      ```
      share( text , subject , chooser title )
      ```
    - Outside Activity
      ```
      shareOther( context , text , subject , chooser title )
      ```
      
  - Email Intent
    - Inside Activity
      ```
      email( email Id , subject , text )
      ```
    - Outside Activity
      ```
      emailOther ( context , email Id , subject , text )
      ```
      
  - Call Intent
    > Make Sure to take run-time permission 

    - Inside Activity
      ```
      makeCall ( Phone Number )
      ```
    - Outside Activity
      ```
      makeCallOther ( context , Phone Number )
      ```
      
  - SMS Intent
    - Inside Activity
      ```
      sendSMS( Phone Number , text )
      ```
    - Outside Activity
      ```
      sendSMSOther( context , Phone Number , text )
      ```
     
---     
## AndyHandy Animations     
     
### Slide Animations     
> Note : Duration and repeatCount are optional by default duration is 2000 ( 2ms ) and repeatCount is 0
- Slide In
  - Slide In from left
    ```
    slideInLeft( view , duration , repeatCount )
    ```
  - Slide In from Right
    ```
    slideInRight( view , duration , repeatCount )
    ```
  - Slide In from Top
    ```
    slideInTop( view , duration , repeatCount )
    ```
  - Slide In from Bottom
    ```
    slideInBottom( view , duration , repeatCount )
    ```
- Slide Out
  - Slide Out from left
    ```
    slideOutLeft( view , duration , repeatCount )
    ```
  - Slide Out from Right
    ```
    slideOutRight( view , duration , repeatCount )
    ```
  - Slide Out from Top
    ```
    slideOutTop( view , duration , repeatCount )
    ```
  - Slide Out from Bottom
    ```
    slideOutBottom( view , duration , repeatCount )
    ```
---     
## Contributing

The best way to submit a patch is to send us a [pull request](https://help.github.com/articles/about-pull-requests/). Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

If you want to add new functionality, please file a new *proposal* issue first to make sure that it is not in progress already. If you have any questions, feel free to create a *question* issue.
