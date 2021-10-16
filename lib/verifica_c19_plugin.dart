
import 'dart:async';

import 'package:flutter/services.dart';

class VerificaC19Plugin {
  static const MethodChannel _channel = MethodChannel('verifica_c19_plugin');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
