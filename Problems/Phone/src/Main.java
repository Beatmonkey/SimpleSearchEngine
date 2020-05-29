class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

   public Phone(String ownerName, String number) {
       this.ownerName = ownerName;
       this.number = number;
   }

   public Phone(String ownerName, String number, String cityCode, String countryCode) {
       this(ownerName, number);
       this.cityCode = cityCode;
       this.countryCode = countryCode;
   }


}