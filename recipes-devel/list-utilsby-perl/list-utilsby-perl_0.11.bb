DESCRIPTION = "This module provides a number of list utility functions, all of which take \
an initial code block to control their behaviour. They are variations on \
similar core perl or "List::Util" functions of similar names, but which use \
the block to control their behaviour. For example, the core Perl function \
"sort" takes a list of values and returns them, sorted into order by their \
string value. The "sort_by" function sorts them according to the string \
value returned by the extra function, when given each value."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-UtilsBy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/List-UtilsBy-0.11.tar.gz"

SRC_URI[md5sum] = "14469e1029060490bc3a563f0e59e5f1"
SRC_URI[sha256sum] = "faddf43b4bc21db8e4c0e89a26e5f23fe626cde3491ec651b6aa338627f5775a"

S = "${WORKDIR}/List-UtilsBy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
