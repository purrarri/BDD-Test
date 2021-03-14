# Dummy Test BDD case e-commerce



#### TODO
- [x] Product Hotel
- [x] Product Flight
- [x] Product Train

.

#### BDD Structure scenario files
```
Profiles
├── Test Cases
│   ├── Product
│     	 └── Flight
│     	 └── Hotel
│     	 └── Train
└── Object Repository
│   ├── Object Login
│   ├── Object Flight
│   ├── Object Hotel
│   ├── Object Train
└── Test Suites
│   ├── Runner TestSuites 
└── Include
│   ├── Feature 
│   │       └── Login.feature
│   │       └── Logout.feature
│   │       └── OrderFlight.feature
│   │       └── OrderHotel.feature
│   │       └── OrderTrain.feature        
│   ├── scripts/ groovy 
│           └── Auth.groovy
│           └── Flight.groovy
│           └── Hotel.groovy
│           └── Train.groovy
└── Datasets
    ├── Dataset files
```


#### How to run
```
Modify the credential using valid email facebook in "Include/features/tiket-web/LoginFacebook.feature"
Run the project runner using Katalon, for each product in following path :
.
├── Test Cases/Product/FlightTransaction
└── Test Cases/Product/HotelTransaction
└── Test Cases/Product/TrainTransaction
```

#### To change xx with any integer (make sure script dynamic), modify the selected examples value in folowing file :
```
├── Include/features/tiket-web/OrderFlight.feature
└── Include/features/tiket-web/OrderHotel.feature
└── Include/features/tiket-web/OrderTrain.feature
```

#### Additiona note/ issue that encountered :
```
While running the test, the console will also print the variable that which is considered important. Such as total payment, VA Account, Bank Account.
here : https://1drv.ms/u/s!Ap42BlcYZmlrgZA15z7xHtRRpKM42Q

And, in another case while received the OTP/ insert the OTP, the procces/page seems like able to by pass without input the valid OTP by hit the dashboard or any other endpoint. And I think this issue already replicated in the test cases.
https://1drv.ms/u/s!Ap42BlcYZmlrgZA15z7xHtRRpKM42Q


```

