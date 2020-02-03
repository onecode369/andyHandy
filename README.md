# AndyHandy

[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

## AndyHandy has :
- **Toast**
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
  
## Contributing

The best way to submit a patch is to send us a [pull request](https://help.github.com/articles/about-pull-requests/). Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

If you want to add new functionality, please file a new *proposal* issue first to make sure that it is not in progress already. If you have any questions, feel free to create a *question* issue.
