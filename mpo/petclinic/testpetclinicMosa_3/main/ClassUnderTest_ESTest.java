/*
 * This file was automatically generated by EvoSuite
 * Fri May 08 09:15:48 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Addresses;
import custom_classes.Cities;
import custom_classes.Dates;
import custom_classes.FirstNames;
import custom_classes.LastNames;
import custom_classes.LongFirstNames;
import custom_classes.LongPetNames;
import custom_classes.LongTelephones;
import custom_classes.PetTypes;
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTest.addNewPetAddEditPetContainerPage(Lcustom_classes/LongPetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 186
   * Goal 2. main.ClassUnderTest.goToAddNewPetOwnerInformationContainerPage()V: Line 366
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnerInformationContainerPage()V: Line 451
   * Goal 8. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 9. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 10. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 11. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 12. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 13. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 14. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 15. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 16. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 17. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 18. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   * Goal 19. main.ClassUnderTest.searchFilterOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 745
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToAddNewPetOwnerInformationContainerPage();
      LongPetNames longPetNames0 = LongPetNames.LEO;
      Dates dates0 = Dates.DATE3;
      PetTypes petTypes0 = PetTypes.HAMSTER;
      classUnderTest0.addNewPetAddEditPetContainerPage(longPetNames0, dates0, petTypes0);
      classUnderTest0.goToHomeThroughNavbarOwnerInformationContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
  }

  //Test case number: 1
  /*
   * 21 covered goals:
   * Goal 1. main.ClassUnderTest.goToEditOwnerOwnerInformationContainerPage()V: Line 380
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 5. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 8. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 9. main.ClassUnderTest.goToOwnersListAddEditOwnerContainerPage()V: Line 555
   * Goal 10. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 11. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 12. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 13. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 14. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 15. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 16. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 17. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 18. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 19. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 20. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   * Goal 21. main.ClassUnderTest.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 631
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Addresses addresses0 = Addresses.FRIENDLY;
      Cities cities1 = Cities.MADISON;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities1, longTelephones0);
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      LastNames lastNames2 = LastNames.RODRIQUEZ;
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames1 = LongFirstNames.EDUARDO;
      LastNames lastNames3 = LastNames.RODRIQUEZ;
      LongTelephones longTelephones1 = LongTelephones.PHONE2;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames1, lastNames3, addresses0, cities1, longTelephones1);
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      LongFirstNames longFirstNames2 = LongFirstNames.LONG;
      Addresses addresses1 = Addresses.LIBERTY;
      LongTelephones longTelephones2 = LongTelephones.PHONE2;
      classUnderTest0.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(longFirstNames2, lastNames1, addresses1, cities0, longTelephones2);
      LastNames lastNames4 = LastNames.DAVIS;
      Addresses addresses2 = Addresses.LIBERTY;
      Cities cities2 = Cities.MONONA;
      LongTelephones longTelephones3 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames4, addresses2, cities2, longTelephones3);
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames2);
      classUnderTest0.goToEditOwnerOwnerInformationContainerPage();
  }

  //Test case number: 2
  /*
   * 24 covered goals:
   * Goal 1. main.ClassUnderTest.goToAddNewPetOwnerInformationContainerPage()V: Line 366
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 8. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 9. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 10. main.ClassUnderTest.goToOwnersListAddEditOwnerContainerPage()V: Line 555
   * Goal 11. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 12. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 13. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 14. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 15. main.ClassUnderTest.goToVeterinariansAddEditPetContainerPage()V: Line 268
   * Goal 16. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 17. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 18. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 19. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 20. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 21. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 22. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 23. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   * Goal 24. main.ClassUnderTest.searchFilterOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 745
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToAddNewPetOwnerInformationContainerPage();
      classUnderTest0.goToVeterinariansAddEditPetContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames1 = FirstNames.GEORGE;
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames1, lastNames0);
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames1 = LongFirstNames.GEORGE;
      Cities cities1 = Cities.WINDSOR;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames1, lastNames0, addresses0, cities1, longTelephones0);
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames1, lastNames1);
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      Addresses addresses1 = Addresses.FRIENDLY;
      classUnderTest0.goToOwnersListAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      LongFirstNames longFirstNames2 = LongFirstNames.BETTY;
      LastNames lastNames2 = LastNames.DAVIS;
      Cities cities2 = Cities.MCFARLAND;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames2, lastNames2, addresses1, cities2, longTelephones0);
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
  }
}
