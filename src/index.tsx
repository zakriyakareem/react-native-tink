import * as React from "react";
import { NativeModules, Platform,
  } from 'react-native';
import WebView from 'react-native-webview';

const LINKING_ERROR =
  `The package 'react-native-tink' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const Tink = NativeModules.Tink
  ? NativeModules.Tink
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

     export function TinkView( {clientId,redirectUrl}:any ) {
       return <WebView
        source={{ uri: `https://link.tink.com/1.0/account-check/create-report?client_id=${clientId}&redirect_uri=${redirectUrl}` }}
        javaScriptEnabled={true}
        domStorageEnabled={true}
        style={{flex:1}}
      />
    }

      











