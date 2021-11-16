const {add, subtract, multiply} = require('../math');

describe("eiei", () => {
    describe("add", () => {
        test('expect 5+3 = 8', () => {
            expect(add(5, 3)).toBe(8);
        });
    });
    describe("subtract", () => {
        test('expect 5-1 =4', () => {
            expect(subtract(5, 1)).toBe(4);
        });
    });
    describe("multiply", () => {
        test('expect 2*3 = 6', () => {
            expect(multiply(2, 3)).toBe(6);
        });
    });
});