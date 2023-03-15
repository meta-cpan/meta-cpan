DESCRIPTION = "This module tries to make it easy to build Perl extensions that use \
functions and typemaps provided by other perl extensions. This means that a \
perl extension is treated like a shared library that provides also a C and \
an XS interface besides the perl one."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Depends"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XA/XAOC/ExtUtils-Depends-0.8001.tar.gz"

SRC_URI[md5sum] = "ca203697162b842c6c1e25ce102b79a5"
SRC_URI[sha256sum] = "673c4387e7896c1a216099c1fbb3faaa7763d7f5f95a1a56a60a2a2906c131c5"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
