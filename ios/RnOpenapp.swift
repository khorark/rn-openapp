@objc(RnOpenapp)
class RnOpenapp: NSObject {

    
    @objc(openApp:withResolver:withRejecter:)
    func openApp(packageId: String, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        reject("Module not supported on this platform")
    }
}
