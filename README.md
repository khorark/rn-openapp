# rn-openapp

## Getting started

`$ npm install rn-openapp --save`

### Mostly automatic installation

`$ react-native link rn-openapp`

## Usage

```javascript
import { openApp } from "rn-openapp";

loginWithApple()
  .openApp(result => cosnole.log(result))
  .catch(e => console.warn(e));
```