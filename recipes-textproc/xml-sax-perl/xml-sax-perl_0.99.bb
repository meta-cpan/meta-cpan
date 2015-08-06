DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and \
APIs required for implementing SAX drivers, along with a factory class \
for returning any SAX parser installed on the user's system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GR/GRANTM/XML-SAX-0.99.tar.gz"

SRC_URI[md5sum] = "290f5375ae87fdebfdb5bc3854019f24"
SRC_URI[sha256sum] = "32b04b8e36b6cc4cfc486de2d859d87af5386dd930f2383c49347050d6f5ad84"
RDEPENDS_${PN} += "xml-namespacesupport-perl"
RDEPENDS_${PN} += "xml-sax-base-perl"

S = "${WORKDIR}/XML-SAX-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
