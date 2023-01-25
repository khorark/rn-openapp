@objc(RnOpenapp)
class RnOpenapp: NSObject {

    @objc(openApp:withResolver:withRejecter:)
    func openApp(_ packageId: String, resolve: RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) -> Void {
        reject("Module failed", "Not supported for this platform", nil)
    }
}
