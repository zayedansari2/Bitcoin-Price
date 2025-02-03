Real-Time Bitcoin Price Tracker

A Java-based application that tracks the real-time price of Bitcoin using an API. This app fetches the current Bitcoin price and updates it periodically, giving users the latest market data at their fingertips.

Features:
- Real-time Bitcoin Price: Fetches and displays the current Bitcoin price in USD.
- API Integration: Uses a public API to get the latest market data.
- User-Friendly Interface: Simple text-based interface to show the Bitcoin price.
- Automatic Updates: Periodically updates the Bitcoin price to reflect real-time changes


How It Works:
- The application sends a request to a public API to fetch the real-time price of Bitcoin.
- It processes the JSON response from the API and extracts the relevant price data.
- The Bitcoin price is then displayed in the console for the user.
- The app can be set to refresh at regular intervals to ensure the price is always up to date.

Technologies Used:
- Java 8+: The application is built using Java and makes use of features like HttpURLConnection for API calls.
- JSON Processing: Uses libraries such as org.json or Gson to handle the API's JSON responses.

Example Output:

    Time Updated: Feb 3, 2025 06:04:15 UTC
    Current Bitcoin Price: $95,879.691
    DISCLAIMER: This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org
    Would you like to refresh the price? (Y/N): N
