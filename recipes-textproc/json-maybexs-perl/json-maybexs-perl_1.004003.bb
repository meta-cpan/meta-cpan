DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS (at \
at least version 3.0) is already loaded, in which case it uses that module. \
Otherwise it tries to load Cpanel::JSON::XS, then JSON::XS, then JSON::PP \
in order, and either uses the first module it finds or throws an error."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON-MaybeXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/JSON-MaybeXS-1.004003.tar.gz"

SRC_URI[md5sum] = "e46181e34588428d317932744597a7ab"
SRC_URI[sha256sum] = "5bee3b17ff9dcffd6e99ab8cf7f35747650bfce1dc622e3ad10b85a194462fbf"
RRECOMMENDS:${PN} += "cpanel-json-xs-perl"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/JSON-MaybeXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
