#include <iostream>
        #include <iomanip>
        #include <boost/geometry.hpp>
        #include <boost/geometry/geometries/point.hpp>

        using namespace std;
        using namespace boost;

        int main()
        {

            //point_type p = boost::geometry::make<point_type>(1, 2, 3);
            //std::cout << boost::geometry::dsv(p) << std::endl;
            //return 0;

            geometry::model::point<int, 3, boost::geometry::cs::cartesian> p;
            geometry::assign_values(p,1, 2, 3);

            geometry::model::point<int, 3, boost::geometry::cs::cartesian> p2;

            p2 = p;

            cout << geometry::dsv(p) << endl;

            cout << geometry::dsv(p2) << endl;

            return 0;
        }
