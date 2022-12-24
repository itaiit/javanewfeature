package appstart.mymodappdemo;

import java.util.ServiceLoader;

import userfuncs.binaryfuncs.BinFuncProvider;

public class MyModAppDemo {
    public static void main(String[] args) {
        ServiceLoader<BinFuncProvider> load = ServiceLoader.load(BinFuncProvider.class);
        load.stream().forEach(service-> {
            BinFuncProvider binFuncProvider = service.get();
            String name = binFuncProvider.get().getName();
            System.out.println("class:" + binFuncProvider.getClass() + "; name:" + name);
        });
    }
}
