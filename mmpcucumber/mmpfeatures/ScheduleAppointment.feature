Feature: ScheduleAppointment

  Scenario: Booking an Appointment
    Given login into Patient Module successfully
    When Patient is able to do booking
    Then the booking is successful