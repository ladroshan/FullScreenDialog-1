[![BCH compliance](https://bettercodehub.com/edge/badge/nikialeksey/FullScreenDialog?branch=master)](https://bettercodehub.com/)
[![Build Status](https://travis-ci.org/nikialeksey/FullScreenDialog.svg?branch=master)](https://travis-ci.org/nikialeksey/FullScreenDialog)
[![codecov](https://codecov.io/gh/nikialeksey/FullScreenDialog/branch/master/graph/badge.svg)](https://codecov.io/gh/nikialeksey/FullScreenDialog)
[![0pdd](http://www.0pdd.com/svg?name=nikialeksey/FullScreenDialog)](http://www.0pdd.com/p?name=nikialeksey/FullScreenDialog)

[![API](https://img.shields.io/badge/API-16%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=16)

# FullScreenDialog
Implementation of [full-screen-dialogs](https://material.io/guidelines/components/dialogs.html#dialogs-full-screen-dialogs) 
from material guidelines.

### Usage
```java
new FsDialog(context, R.style.AppTheme, "Title", new FsDialogCloseAction() {
    @Override
    public void onClose(@NonNull final FsDialog dialog) {
// close action
    }
}, "Action Title", new FsDialogAction() {
    @Override
    public void onAction(@NonNull final FsDialog dialog) {
//  base action        
    }
}, contentView).show();
```