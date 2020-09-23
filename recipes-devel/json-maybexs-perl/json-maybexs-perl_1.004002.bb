DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS (at \
at least version 3.0) is already loaded, in which case it uses that module. \
Otherwise it tries to load Cpanel::JSON::XS, then JSON::XS, then JSON::PP \
in order, and either uses the first module it finds or throws an error."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON-MaybeXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/JSON-MaybeXS-1.004002.tar.gz"

SRC_URI[md5sum] = "2c40209b38b7a569b3bfc4d88e47d98c"
SRC_URI[sha256sum] = "3b8e2fdc3b36d0c5edbc78121840dced63798ad49cabcf875d5c5e32336d77b5"
RRECOMMENDS_${PN} += "cpanel-json-xs-perl"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/JSON-MaybeXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
