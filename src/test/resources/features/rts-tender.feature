Feature: Get Initial price and summary amount units of measure

  Scenario: Get Initial price and summary amount units of measure
    Then Click "/zakupki-223/participants-223" link
    Then Click "/poisk/poisk-223-fz/" link
    Then Click "main-search__settings" settings
    Then Click "615-ПП РФ" checkbox
    Then Click "Исключить совместные закупки" checkbox
    Then Filter dates
    Then Set "Алтайский край" region
    Then Get result info