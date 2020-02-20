
  Pod::Spec.new do |s|
    s.name = 'CapacitorFirebaseCrashlytics'
    s.version = '0.0.1'
    s.summary = 'Firebase Crashlytics'
    s.license = 'MIT'
    s.homepage = 'https://github.com/OOShoppingnl/capacitor-firebase-crashlytics'
    s.author = 'Hatsa'
    s.source = { :git => 'https://github.com/OOShoppingnl/capacitor-firebase-crashlytics', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end