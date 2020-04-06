import { NativeModules } from "react-native";

const { Openapp } = NativeModules;

export const openApp = async (packageId) => {
  if (!packageId || typeof packageId !== "string")
    throw new Error("Invalid package id");

  try {
    await Openapp.openApp(packageId);
    return true;
  } catch (e) {
    throw new Error(e);
  }
};
