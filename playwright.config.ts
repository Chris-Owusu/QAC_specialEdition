import { PlaywrightTestConfig, devices } from '@playwright/test'


const config: PlaywrightTestConfig = {
  forbidOnly: !!process.env.CI,
  retries: process.env.CI ? 2 : 0,
  reporter: process.env.CI ? 'github' : 'list',
  testDir: 'src/tests/e2e/',
  timeout: 60000,
  use: {
    baseURL:
      '',
    trace: 'on-first-retry',
    ignoreHTTPSErrors: true,
    screenshot: 'off',
    
  },
  projects: [
    {
      name: 'chromium',
      testMatch: 'src/tests/**/*spec.ts',

      use: {
        ...devices['Desktop Chrome'],
        viewport: { width: 1920, height: 1080 },
      },
    },
    {
      name: 'firefox',
      testMatch: 'src/tests/**/*spec.ts',
      use: {
        ...devices['Desktop Firefox'],
        viewport: { width: 1920, height: 1080 },
      },
    },
    {
      name: 'webkit',
      testMatch: 'src/tests/**/*spec.ts',
      use: {
        ...devices['Desktop Safari'],
        viewport: { width: 1920, height: 1080 },
      },
    },
    {
      name: 'SamsungGalaxyS21',
      testMatch: 'src/tests/e2e/*/mobile/*spec.ts',
      use: {
        browserName: 'chromium',
        ...devices['Samsung Galaxy S21'],
        viewport: { width: 360, height: 800 },
      },
    },
    {
      name: 'iPhone13',
      testMatch: '/src/tests/e2e/*/mobile/*spec.ts',
      use: {
        browserName: 'webkit',
        ...devices['iPhone 13'],
        viewport: { width: 390, height: 844 },
      },
    },
    {
      name: 'iPadPro11',
      testMatch: '/src/tests/e2e/*/tablet/*spec.ts',
      use: {
        browserName: 'webkit',
        ...devices['iPad Pro 11'],
        viewport: { width: 768, height: 1024 },
      },
    },
  ],
}
export default config
