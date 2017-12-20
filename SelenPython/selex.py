# -*- coding: utf-8 -*-

from selenium import webdriver

driver = webdriver.Chrome(".\\resources\\chromedriver.exe")
driver.get("https://google.com")
driver.find_element_by_name("q").send_keys("WebDriver")
driver.find_element_by_name("btnK").click()
driver.quit()

