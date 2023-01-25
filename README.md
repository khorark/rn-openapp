# rn-openapp

## Motivation
<p align="center" style="font-size:20px;">
This package help you openned other user app on android phone. You only need know package id.
</p>

## Installation

`$ npm install rn-openapp --save`

### Mostly automatic installation

`$ react-native link rn-openapp`

## Usage

:exclamation: **IMPORTANT** :exclamation: You can open app only Android platform :exclamation:

```javascript
import { openApp } from "rn-openapp";

const examplePackageId = "com.example.packageid";

openApp(examplePackageId)
  .then(result => cosnole.log(result))
  .catch(e => console.warn(e));
```

## Licence MIT.