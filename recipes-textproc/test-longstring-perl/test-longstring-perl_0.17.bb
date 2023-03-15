DESCRIPTION = "This module provides some drop-in replacements for the string comparison \
functions of Test::More, but which are more suitable when you test against \
long strings. If you've ever had to search for text in a multi-line string \
like an HTML document, or find specific items in binary data, this is the \
module for you."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-LongString"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RG/RGARCIA/Test-LongString-0.17.tar.gz"

SRC_URI[md5sum] = "8baab770f61ebd5647a9dd3679f42fbd"
SRC_URI[sha256sum] = "abc4349eaf04d1bec1e464166a3018591ea846d8f3c5c9c8af4ac4905d3e974f"

S = "${WORKDIR}/Test-LongString-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
