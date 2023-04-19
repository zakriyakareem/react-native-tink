import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { TinkView } from 'react-native-tink';


export default function App() {
  const [result, setResult] = React.useState<string | undefined>();

  React.useEffect(() => {
    // launchTinkProductFlow('hello')
   
    // myFirstMethod('hello').then((value:string)=>{
    //   console.log('value :',value)
    // })
   
  }, []);

  return (
    <View style={styles.container}>
      <TinkView clientId={`2b40d76678a2415eb4be14a415685db2`} redirectUrl={`https://console.tink.com/callback&market=SE`}/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
   
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
