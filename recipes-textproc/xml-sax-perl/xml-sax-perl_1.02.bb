DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GR/GRANTM/XML-SAX-1.02.tar.gz"

SRC_URI[md5sum] = "b62e3754523695c7f5bbcafa3676a38d"
SRC_URI[sha256sum] = "4506c387043aa6a77b455f00f57409f3720aa7e553495ab2535263b4ed1ea12a"
RDEPENDS:${PN} += "xml-namespacesupport-perl"
RDEPENDS:${PN} += "xml-sax-base-perl"

S = "${WORKDIR}/XML-SAX-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
