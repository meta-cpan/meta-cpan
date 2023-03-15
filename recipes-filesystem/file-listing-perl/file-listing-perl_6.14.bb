DESCRIPTION = "This module exports a single function called "parse_dir", which can be used \
to parse directory listings."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Listing"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Listing-6.14.tar.gz"

SRC_URI[md5sum] = "cf60a79563185391831613178a79b4cd"
SRC_URI[sha256sum] = "15b3a4871e23164a36f226381b74d450af41f12cc94985f592a669fcac7b48ff"
RDEPENDS:${PN} += "http-date-perl"

S = "${WORKDIR}/File-Listing-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
