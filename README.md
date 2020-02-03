# AndyHandy

[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

## AndyHandy has :
- **Toast**
- **Snackbar**
- **Alert Dialog Box**
- **Notification**
- **Intents**
---

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
      sendSMSOther( context , text )
      ```
     
     
## Contributing

The best way to submit a patch is to send us a [pull request](https://help.github.com/articles/about-pull-requests/). Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

If you want to add new functionality, please file a new *proposal* issue first to make sure that it is not in progress already. If you have any questions, feel free to create a *question* issue.
