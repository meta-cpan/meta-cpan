DESCRIPTION = "The "mro" namespace provides several utilities for dealing with method \
resolution order and method caching in general in Perl 5.9.5 and higher."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MRO-Compat"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/MRO-Compat-0.15.tar.gz"

SRC_URI[md5sum] = "f644dafe901214cedfa7ed8b43b56df1"
SRC_URI[sha256sum] = "0d4535f88e43babd84ab604866215fc4d04398bd4db7b21852d4a31b1c15ef61"

S = "${WORKDIR}/MRO-Compat-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
