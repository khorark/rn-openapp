#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(RnOpenapp, NSObject)


RCT_EXTERN_METHOD(openApp:(NSString *)packageId
                 withResolver:(RCTPromiseResolveBlock)resolve
                 withRejecter:(RCTPromiseRejectBlock)reject)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
