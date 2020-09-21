DESCRIPTION = "This module is an interface to libxml2, providing XML and HTML parsers with \
DOM, SAX and XMLReader interfaces, a large subset of DOM Layer 3 interface \
and a XML::XPath-like interface to XPath API of libxml2. The module is \
split into several packages which are not described in this section; unless \
stated otherwise, you only need to "use XML::LibXML;" in your programs."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-LibXML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/XML-LibXML-2.0206.tar.gz"

SRC_URI[md5sum] = "6d9e4ffb139c26a36eea964dc512ec77"
SRC_URI[sha256sum] = "010ba395c38711f9c233ee23d0b0b18b761e6d99a762125f7e6180d068851619"
DEPENDS += "libxml2"
DEPENDS += "libxml-sax-perl-native"
DEPENDS += "zlib"
RDEPENDS_${PN} += "libxml2"
RDEPENDS_${PN} += "xml-sax-base-perl"
RDEPENDS_${PN} += "xml-sax-perl"
RDEPENDS_${PN} += "xml-namespacesupport-perl"

S = "${WORKDIR}/XML-LibXML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
