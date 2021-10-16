import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:verifica_c19_plugin/verifica_c19_plugin.dart';

void main() {
  const MethodChannel channel = MethodChannel('verifica_c19_plugin');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await VerificaC19Plugin.platformVersion, '42');
  });
}
