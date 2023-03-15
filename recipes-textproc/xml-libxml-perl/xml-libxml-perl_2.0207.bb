DESCRIPTION = "This module is an interface to libxml2, providing XML and HTML parsers with \
DOM, SAX and XMLReader interfaces, a large subset of DOM Layer 3 interface \
and a XML::XPath-like interface to XPath API of libxml2. The module is \
split into several packages which are not described in this section; unless \
stated otherwise, you only need to "use XML::LibXML;" in your programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-LibXML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/XML-LibXML-2.0207.tar.gz"

SRC_URI[md5sum] = "d943c3ff20e19c376f08adcbc4158019"
SRC_URI[sha256sum] = "903436c9859875bef5593243aae85ced329ad0fb4b57bbf45975e32547c50c15"
DEPENDS += "libxml2"
DEPENDS += "libxml-sax-perl-native"
DEPENDS += "zlib"
RDEPENDS:${PN} += "libxml2"
RDEPENDS:${PN} += "xml-sax-base-perl"
RDEPENDS:${PN} += "xml-sax-perl"
RDEPENDS:${PN} += "xml-namespacesupport-perl"

S = "${WORKDIR}/XML-LibXML-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
