@new_vendor
Feature: Ajouter un nouveau vendeur
  En tant que utilisateur je souhaite ajouter un nouveau vendeur

  Background: 
    Given Je me connecte sur l application Nopcommerce
    When Je saisis le username "admin@yourstore.com"
    And Je saisis le mot le passe "admin"
    And Je clique sur le bouton LOGIN

  @add_vendor
  Scenario Outline: J ajoute un nouveau vendeur
    And Je clique sur Customers dans la barre gauche
    And Je clique sur Vendors
    And Je clique sur Add New
    And Je saisis Name "<name_vendor>"
    And Je saisis Description "<description>"
    And Je saisis l emailVendor "<email_vendor>"
    And Je clique sur SaveVendor
    Then le message "For security purposes, the feature you have requested is not available on the demo site." doit s affiche

    Examples: 
      | name_vendor | description | email_vendor      |
      | Vendor1     | Vendor1     | Vendor1@gmail.com |
      | Vendor2     | Vendor2     | Vendor2@gmail.com |
      