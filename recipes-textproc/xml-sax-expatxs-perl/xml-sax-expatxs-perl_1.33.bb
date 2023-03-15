DESCRIPTION = "XML::SAX::ExpatXS is a direct XS extension to Expat XML parser. It \
implements Perl SAX 2.1 interface. See \
http://perl-xml.sourceforge.net/perl-sax/ for Perl SAX API description. Any \
deviations from the Perl SAX 2.1 specification are considered as bugs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX-ExpatXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PC/PCIMPRICH/XML-SAX-ExpatXS-1.33.tar.gz"

SRC_URI[md5sum] = "3d69bb642ea275871a2f91a08a51cd8c"
SRC_URI[sha256sum] = "1e3db191853d235c42c7d2a5dc2ea055158ff29c7d54c5c673d271cdbd43bc6a"
DEPENDS += "expat"
RDEPENDS:${PN} += "xml-sax-perl"

S = "${WORKDIR}/XML-SAX-ExpatXS-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR} CC='${CC}' LD='${CCLD}' FULL_AR='${AR}'"

inherit cpan

BBCLASSEXTEND = "native"
