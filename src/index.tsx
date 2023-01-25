import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'rn-openapp' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const RnOpenapp = NativeModules.RnOpenapp
  ? NativeModules.RnOpenapp
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function multiply(a: number, b: number): Promise<number> {
  return RnOpenapp.multiply(a, b);
}
