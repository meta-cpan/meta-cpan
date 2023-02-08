DESCRIPTION = "An "HTTP::Message" object contains some headers and a content body. The \
following methods are available:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Message-6.36.tar.gz"

SRC_URI[md5sum] = "e847fb3e297e740080ab6fd1ac127f7f"
SRC_URI[sha256sum] = "576a53b486af87db56261a36099776370c06f0087d179fc8c7bb803b48cddd76"
RDEPENDS:${PN} += "encode-locale-perl"
RDEPENDS:${PN} += "http-date-perl"
RDEPENDS:${PN} += "io-html-perl"
RDEPENDS:${PN} += "lwp-mediatypes-perl"
RDEPENDS:${PN} += "uri-perl"
DEPENDS += "try-tiny-perl-native"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
