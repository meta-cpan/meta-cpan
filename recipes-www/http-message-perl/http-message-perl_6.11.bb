DESCRIPTION = "An "HTTP::Message" object contains some headers and a content body. The \
following methods are available:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/HTTP-Message-6.11.tar.gz"

SRC_URI[md5sum] = "4ed7add10daea3ab30abfeab6d03872f"
SRC_URI[sha256sum] = "e7b368077ae6a188d99920411d8f52a8e5acfb39574d4f5c24f46fd22533d81b"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "io-compress-perl"
RDEPENDS_${PN} += "io-html-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "uri-perl"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
