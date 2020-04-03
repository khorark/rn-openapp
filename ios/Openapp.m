#import "Openapp.h"


@implementation Openapp

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(openApp: (NSString *)packageId
                 resolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    reject(@"no_events", @"Module not supported on this platform", nil);
}

@end
