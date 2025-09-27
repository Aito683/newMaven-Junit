Feature: Housing Agency
  Scenario: Manage Houses for Rental Agency
    Given a list of houses held by a rental agency with the following details:
      | House Name       | Price per Night | Rooms | Maximum Guests | Wi-Fi | Parking | Address                    | Check-in Time | Check-out Time |
      |------------------|-----------------|-------|----------------|-------|---------|----------------------------|---------------|----------------|
      | Beachfront Villa | $300.00         | 5     | 10             | Yes   | Yes     | 123 Oceanview Drive        | 3:00 PM       | 11:00 AM       |
      | Cozy Cabin       | $100.00         | 2     | 4              | No    | Yes     | 456 Forest Retreat         | 2:00 PM       | 10:00 AM       |
      | City Apartment   | $150.00         | 3     | 6              | Yes   | No      | 789 Downtown Boulevard     | 4:00 PM       | 12:00 PM       |
      | Mountain Lodge   | $250.00         | 4     | 8              | Yes   | Yes     | 1010 Scenic Mountain Road  | 2:30 PM       | 10:30 AM       |