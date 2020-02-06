# AndyHandy

[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0) [![Latest AndyHandy Release](https://jitpack.io/v/onecode369/andyHandy.svg)](https://jitpack.io/#onecode369/andyHandy)

### All these animations are of single line
<img src="https://github.com/onecode369/andyHandy/blob/master/docs/animations.gif" width="30%"/>

## How to add AndyHandy Library to your app
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
  - **Fade Animations**
    - **Fade In**
    - **Fade Out**
  - **Translate Animations**
    - **Translate along X**
    - **Translate along Y**
  - **Rotate Animation**
    - **Rotate along X**
    - **Rotate along Y**
    - **Rotate along Z**
  - **Zoom Animation**
    - **Zoom In**
    - **Zoom Out**
  - **Bounce Animation**
    - **Bounce In from left**
    - **Bounce In from right**
    - **Bounce In from top**
    - **Bounce In from bottom**
  - **Rotate and Zoom**
    - **Rotate and Zoom In**
      - **Rotate along X**
      - **Rotate along Y**
      - **Rotate along Z**
    - **Rotate and Zoom Out**
      - **Rotate along X**
      - **Rotate along Y**
      - **Rotate along Z**
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
> Button and its function are optional
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
> Buttons and their functions are optional
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

### Fade Animations
> Note : Duration and repeatCount are optional by default duration is 2000 ( 2ms ) and repeatCount is 0
- Fade in
  ```
  fadeIn( view , duration , repeatCount )
  ```
- Fade out
  ```
  fadeOut( view , duration , repeatCount )
  ```
    
### Translate Animations
> Note : Duration , repeatCount , from and to positions are optional by default duration is 2000 ( 2ms ) , repeatCount is 0 , from is -250f and to is 0f
- Translate along X
  ```
  translateX( view , duration , repeatCount , from , to )
  ```
- Translate along Y
  ```
  translateY( view , duration , repeatCount , from , to )
  ```
  
### Rotate Animations
> Note : Duration , repeatCount , from and to positions are optional by default duration is 2000 ( 2ms ) , repeatCount is 0 , from is -360f and to is 0f
- Rotate along X
  ```
  rotateX( view , duration , repeatCount , from , to )
  ```
- Rotate along Y
  ```
  rotateY( view , duration , repeatCount , from , to )
  ```  
- Rotate along Z
  ```
  rotateZ( view , duration , repeatCount , from , to )
  or
  rotate( view , duration , repeatCount , from , to )
  ```
 
### Zoom Animations
> Note : Duration and repeatCount are optional by default duration is 2000 ( 2ms ) and repeatCount is 0
- Zoom in
  ```
  zoomIn( view , duration , repeatCount )
  ```
- Zoom out
  ```
  zoomOut( view , duration , repeatCount )
  ```
    
### Bounce Animations     
> Note : Duration and repeatCount are optional by default duration is 2000 ( 2ms ) and repeatCount is 0
- Bounce In from left
  ```
  bounceInLeft( view , duration , repeatCount )
  ```
- Bounce In from Right
  ```
  bounceInRight( view , duration , repeatCount )
  ```
- Bounce In from Top
  ```
  bounceInTop( view , duration , repeatCount )
  ```
- Bounce In from Bottom
  ```
  bounceInBottom( view , duration , repeatCount )
  ```
    
### Rotate and Zoom Animations
> Note : Duration and repeatCount are optional by default duration is 2000 ( 2ms ) and repeatCount is 0
- Rotate and Zoom In
  - Rotate along X
    ```
    rotateZoomInX( view , duration , repeatCount)
    ```
  - Rotate along Y
    ```
    rotateZoomInY( view , duration , repeatCount)
    ```  
  - Rotate along Z
    ```
    rotateZoomInZ( view , duration , repeatCount)
    ```
- Rotate and Zoom Out
  - Rotate along X
    ```
    rotateZoomOutX( view , duration , repeatCount)
    ```
  - Rotate along Y
    ```
    rotateZoomOutY( view , duration , repeatCount)
    ```  
  - Rotate along Z
    ```
    rotateZoomOutZ( view , duration , repeatCount)
    ```    

---     
## Contributing

The best way to submit a patch is to send us a [pull request](https://help.github.com/articles/about-pull-requests/). Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

If you want to add new functionality, please file a new *proposal* issue first to make sure that it is not in progress already. If you have any questions, feel free to create a *question* issue.
