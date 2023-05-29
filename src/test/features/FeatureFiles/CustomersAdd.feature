@new_customer
Feature: Ajouter un nouveau client
  En tant que utilisateur je souhaite ajouter un nouveau client

Background: 
		Given Je me connecte sur l application Nopcommerce
    When Je saisis le username "admin@yourstore.com"
    And Je saisis le mot le passe "admin"
    And Je clique sur le bouton LOGIN

  @add_customer
  Scenario Outline: Ajout d un nouveau client - cas passant

    And Je clique sur Customers dans la barre gauche
    And Je clique sur Customer
    And Je clique sur le bouton Add New
    And Je saisis l email "<email>"
    And Je saisis le password "<password>"
    And Je saisis First name "<first_name>"
    And Je saisis Last name "<Last_name>"
    And Je coche Female
    And Je saisis la date "<date>"
    And Je selectionne Text store dans Newsletter "Your" "Your store name"
    And Je selectionne Vendor 1 dans manager of Vendors 
    And Je saisis un commentaire "<comment>"
    And Je clique sur le bouton Save
		Then le message de succees "The new customer has been added successfully" doit s afficher
		
    Examples: 
      | email            | password | first_name | Last_name | date   | comment       |
      | test@gmail.com   | 22884159 | name1      | lastname1 | 3/23/2023 | Admin comment |
      | email@hotmail.fr | 22222222 | name2      | lastname2 | 9/14/2023 | Admin comment |

     