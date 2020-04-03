import { NativeModules } from "react-native";

const { Openapp } = NativeModules;

export const openApp = packageId => {
  try {
    Openapp.openApp(packageId);
    return true;
  } catch (e) {
    throw new Error(e);
    return false;
  }
};
